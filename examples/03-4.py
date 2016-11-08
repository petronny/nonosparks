import json
example='03-4'
data={}
data['width']=5
data['height']=1
data['hints']={}
data['hints']['vertical']=['4']
data['answer']=[]
data['answer'].append([0,1,1,1,0])
json.dump(data,open('examples/'+example+'.json','w'),sort_keys=True)
