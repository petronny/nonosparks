import json
stage='16'
data={}
data['width']=15
data['height']=10
data['name']='Platypus flag'
data['hints']={}
data['hints']['horizontal']=['4 4','1 1 1','1 1','1 1 1 1','5','5','7','3','5','1 1 1','3','1 1','1 1','1 1','3']
data['hints']['vertical']=['1','1','1 1 1','2 3 2 1','1 7 3 1','7 1','1 7 3 1','2 3 2 1','1 1 1','1']
data['answer']=[]
data['answer'].append([0,1,0,0,0,0,0,0,0,0,0,0,0,0,0])
data['answer'].append([1,0,0,0,0,0,0,0,0,0,0,0,0,0,0])
data['answer'].append([1,0,0,1,0,0,1,0,0,0,0,0,0,0,0])
data['answer'].append([1,1,0,0,1,1,1,0,1,1,0,0,0,1,0])
data['answer'].append([1,0,1,1,1,1,1,1,1,0,1,1,1,0,1])
data['answer'].append([0,0,0,0,1,1,1,1,1,1,1,0,0,0,1])
data['answer'].append([1,0,1,1,1,1,1,1,1,0,1,1,1,0,1])
data['answer'].append([1,1,0,0,1,1,1,0,1,1,0,0,0,1,0])
data['answer'].append([1,0,0,1,0,0,1,0,0,0,0,0,0,0,0])
data['answer'].append([1,0,0,0,0,0,0,0,0,0,0,0,0,0,0])

json.dump(data,open(stage+'.json','w'),sort_keys=True)
