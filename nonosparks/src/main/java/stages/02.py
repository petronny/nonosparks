import json
stage='02'
data={}
data['width']=3
data['height']=3
data['hints']={}
data['hints']['horizontal']=['1','1 1','1']
data['hints']['vertical']=['1','1 1','1']
data['name']='Nails'
data['answer']=[]
data['answer'].append([0,1,0])
data['answer'].append([1,0,1])
data['answer'].append([0,1,0])
data['tips']='tips/02.json'
json.dump(data,open(stage+'.json','w'),sort_keys=True)
